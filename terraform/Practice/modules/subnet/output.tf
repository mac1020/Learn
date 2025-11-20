output "subnet_name" {
 description = "Subnet Name"
  value       = azurerm_subnet.subnet.name
}
output "subnet_id" {
  description = "ID of the Subnet"
  value = azurerm_subnet.subnet.id
}