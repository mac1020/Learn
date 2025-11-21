terraform {
  required_providers {
    azurerm = {
      source = "hashicorp/azurerm"
      version = "4.53.0"
    }
  }
  backend "azurerm" {
    resource_group_name   = "tfstate-rg"
    storage_account_name  = "agnitfstatebackend"
    container_name        = "tfstate"
    key                   = "prod.terraform.tfstate"
  }
}

provider "azurerm" {
  features {
    
  }
subscription_id = "40668e7b-dd47-47ea-8ebf-378759256b0b"
}
