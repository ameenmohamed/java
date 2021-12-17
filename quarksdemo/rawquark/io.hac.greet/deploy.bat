@ECHO OFF
aws s3 cp  ./target/function.zip s3://hac-aerlingus/lambdacode/rawquarkus.zip --profile hac
aws lambda update-function-code --function-name  RawQuarkus --s3-bucket hac-aerlingus --s3-key lambdacode/rawquarkus.zip --profile hac
