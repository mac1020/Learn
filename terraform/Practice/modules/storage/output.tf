output "storage_account_id" {
  description = "The ID of the created Storage Account"
  value       = azurerm_storage_account.storage.id
}

output "storage_account_name" {
  description = "The name of the Storage Account"
  value       = azurerm_storage_account.storage.name
}

output "primary_connection_string" {
  description = "Primary connection string"
  value       = azurerm_storage_account.storage.primary_connection_string
  sensitive   = true
}

output "primary_blob_endpoint" {
  description = "Blob service endpoint"
  value       = azurerm_storage_account.storage.primary_blob_endpoint
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
