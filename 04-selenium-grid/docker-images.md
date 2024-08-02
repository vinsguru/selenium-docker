# Docker Images

## First check your CPU architecture

- MAC/Linux users
`uname -m`
- Windows Users
`echo %PROCESSOR_ARCHITECTURE%`

If you see "arm", then use ARM images.

Use this docker images for creating selenium grid. There are some know issues with latest version. So DO NOT use those.

| Image      | ARM | Others     |
| :---        |    :----:   |          ---: |
| Hub      | seleniarm/hub:4.20       | selenium/hub:4.20   |
| Chrome      | seleniarm/node-chromium:4.20       | selenium/node-chrome:4.20   |
| Firefox      | seleniarm/node-firefox:4.20       | selenium/node-firefox:4.20   |

## References:

- [Selenium](https://hub.docker.com/u/selenium)
- [Seleniarm](https://hub.docker.com/u/seleniarm)
- [Seleniarm to Selenium Namespace](https://github.com/SeleniumHQ/docker-selenium/issues/1847)
- [Edge does not work in arm](https://techcommunity.microsoft.com/t5/discussions/edge-for-linux-arm64/m-p/1532272)
