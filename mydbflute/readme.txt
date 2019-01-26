
[Test Procedure]

A. upgrade to latest version

## Act ##
execute "sh manage.sh 94"

## Assert ##
o DBFlute Client _project.sh|bat should be changed to latest version
o DBFlute Engine that is latest version should be located in mydbflute directory


B. patch engine as the same version

## Act ##
execute "sh manage.sh 94 1.1.8"

## Assert ##
o DBFlute Client _project.sh|bat is not changed
o DBFlute Engine's various resources should be changed
o DBFlute Engine's product-is-dbflute-1.1.8 should be changed

// revert after test
