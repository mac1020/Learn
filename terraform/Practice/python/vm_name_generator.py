#!/usr/bin/env python3

import json
import random
import string

# Generate a random 6-character suffix
suffix = ''.join(random.choices(string.ascii_lowercase + string.digits, k=6))

vm_name = f"vm-{suffix}"

# Return JSON for Terraform external data source
print(json.dumps({
    "vm_name": vm_name
}))