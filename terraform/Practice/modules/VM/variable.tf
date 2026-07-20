variable "vm_name" {}
variable "location" {}
variable "resource_group_name" {}
variable "vm_size" {}
variable "nic_id" {}
variable "admin_username" {
  type = string
}
variable "admin_password" {
  type      = string
  sensitive = true
}
