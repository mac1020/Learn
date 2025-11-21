resource_group_name = "agni-rg"
location            = "eastus"
virtual_network_name = "agni-vnet"
address_space = [ "10.0.0.0/16" ]
subnet_name = "agni-subnet"
address_prefixes = [ "10.0.1.0/24", "10.0.2.0/24", "10.0.3.0/24"]
storage_account_name   = "agnimystorageacc"
account_tier           = "Standard"
replication_type       = "LRS"
//storage
