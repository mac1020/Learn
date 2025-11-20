output "vnet_id" {
  value       = azurerm_virtual_network.vnet.id
  description = "ID of the Virtual Network"
}
output "virtual_network_name" {
  description = "Virtual Network Name"
  value       = azurerm_virtual_network.vnet.name
}