resource "azurerm_resource_group" "rg" {
  name     = var.resource_group_name
  location = var.location
}

module "vnet" {
  source               = "./modules/vnet"
  virtual_network_name = var.virtual_network_name
  location             = var.location
  resource_group_name  = var.resource_group_name
  address_space        = var.address_space
}

module "subnet" {
  source = "./modules/subnet"
  subnet_name = var.subnet_name
  resource_group_name = var.resource_group_name
  virtual_network_name = var.virtual_network_name
  address_prefixes = var.address_prefixes
}

module "storage" {
  source                = "./modules/storage"
  storage_account_name  = var.storage_account_name
  resource_group_name   = azurerm_resource_group.rg.name
  location              = azurerm_resource_group.rg.location
  account_tier          = "Standard"
  replication_type      = "LRS"
}

module "nic" {
  source = "./modules/nic"

  nic_name            = var.nic_name
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
  subnet_id           = azurerm_subnet.subnet.id
}

data "external" "vm_name" {
  program = ["python3", "${path.module}/python/vm_name_generator.py"]
}

module "VM" {
  source = "./modules/VM"
  vm_name             = data.external.vm_name.result.vm_name
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
  vm_size             = "Standard_B2s"
  nic_id = azurerm_network_interface.nic.id
  admin_username = var.admin_username
  admin_password = var.admin_password
} 