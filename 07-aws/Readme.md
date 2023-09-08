# AMI Setup

## docker-compose install
- [Reference](https://github.com/docker/compose/releases)
- ARM:

`sudo curl -SL https://github.com/docker/compose/releases/download/v2.21.0/docker-compose-linux-aarch64 -o /usr/bin/docker-compose`

- X86:

`sudo curl -SL https://github.com/docker/compose/releases/download/v2.21.0/docker-compose-linux-x86_64 -o /usr/bin/docker-compose`

## Make it executable
`sudo chmod +x /usr/bin/docker-compose`

## Instal Java
`sudo apt install openjdk-17-jre-headless -y`

## Run docker without sudo
`sudo usermod -aG docker $USER`