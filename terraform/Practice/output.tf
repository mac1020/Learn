output "resource_group_id" {
  description = "The ID of the Resource Group"
  value       = azurerm_resource_group.rg.id
}

output "resource_group_name" {
  description = "Resource Group Name"
  value       = azurerm_resource_group.rg.name
}
output "vnet_id" {
  value       = module.vnet.vnet_id
  description = "ID of the Virtual Network"
}
output "virtual_network_name" {
  description = "Virtual Network Name"
  value       = module.vnet.virtual_network_name
}
output "subnet_name" {
 description = "Subnet Name"
  value       = module.subnet.subnet_name
}
output "subnet_id" {
  description = "ID of the Subnet"
  value = module.subnet.subnet_id
}

output "storage_account_id" {
  description = "ID of the Storage Account"
  value       = module.storage.storage_account_id
}

output "storage_account_name" {
  description = "Name of the Storage Account"
  value       = module.storage.storage_account_name
}

output "storage_primary_blob_endpoint" {
  description = "Blob endpoint of the storage account"
  value       = module.storage.primary_blob_endpoint
}

output "storage_primary_connection_string" {
  description = "Primary connection string"
  value       = module.storage.primary_connection_string
  sensitive   = true
}

output "nic_name" {
  value = azurerm_network_interface.nic.name
}

output "nic_id" {
  value = azurerm_network_interface.nic.id
}

output "vm_name" {
  value = azurerm_linux_virtual_machine.vm.name
}

output "vm_id" {
  value = azurerm_linux_virtual_machine.vm.id
}