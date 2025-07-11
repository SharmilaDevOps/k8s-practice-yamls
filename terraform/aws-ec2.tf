provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "example" {
  ami           = "ami-0c02fb55956c7d316"  # Amazon Linux 2 AMI (example)
  instance_type = "t2.micro"

  tags = {
    Name = "ExampleInstance"
  }
}
