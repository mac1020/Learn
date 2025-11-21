variable "resource_group_name" {
  description = "Name of the resource group"
  type        = string
}

variable "location" {
  description = "Azure region"
  type        = string
  default     = "eastus"
}

variable "virtual_network_name" {
    description = "Name of the virtual network"
    type = string
  
}

variable "address_space" {
  type = list(string)
}

variable "subnet_name" {
  type = string
}
variable "address_prefixes" {
  type = list(string)
}

variable "account_tier" {
  description = "Storage account tier"
  type        = string
  default     = "Standard"
}

variable "replication_type" {
  description = "Replication type"
  type        = string
  default     = "LRS"
}

variable "storage_account_name" {
  description = "Name of the Storage Account"
  type        = string
}
