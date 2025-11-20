 #!/bin/bash
a = (1 2 hi "hello")
echo "${a[0]}"
echo "${a[*]}"
echo "${a[*]:1}
echo "${a[*]:1:2}
a+=(new 5 6)
echo "${a[*]}

#key value array

declare -A b

b = ([name]="Mehak" [age]=25)
echo "${b[name]}
