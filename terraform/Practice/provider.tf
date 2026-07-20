terraform {
  required_providers {
    azurerm = {
      source = "hashicorp/azurerm"
      version = "4.53.0"
    }
  }
  backend "azurerm" {
    resource_group_name   = "tfstate-rg"
    storage_account_name  = "mytfstatebackend01"
    container_name        = "tfstate"
    key                   = "terraform.tfstate"
  }
}

provider "azurerm" {
  features {
    
  }
use_oidc = true
}