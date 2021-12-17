@ECHO OFF
aws s3 cp  ./target/function.zip s3://hac-aerlingus/lambdacode/nativequarkus.zip --profile hac
aws lambda update-function-code --function-name  NativeQuarkus --s3-bucket hac-aerlingus --s3-key lambdacode/nativequarkus.zip --profile hac
