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
  storage_account_name  = "myteststorage1234"
  resource_group_name   = azurerm_resource_group.rg.name
  location              = azurerm_resource_group.rg.location
  account_tier          = "Standard"
  replication_type      = "LRS"
}