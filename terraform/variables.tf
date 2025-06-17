variable "region" {
  description = "AWS region"
  default     = "us-west-2"
}

variable "instance_type" {
  description = "EC2 instance type"
  default     = "t2.micro"
}

variable "ami" {
  description = "AMI ID for EC2"
  default     = "ami-0c94855ba95c71c99" # Update as needed
}

variable "key_name" {
  description = "Key pair name for SSH access"
  type        = string
}
