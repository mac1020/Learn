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