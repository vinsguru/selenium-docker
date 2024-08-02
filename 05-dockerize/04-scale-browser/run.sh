# start the grid with 2 chrome containers
docker-compose -f grid.yaml up --scale chrome=2 -d

# run test suites with chrome
BROWSER=chrome docker-compose up

# stop chrome and run firefox containers
docker-compose -f grid.yaml up --scale firefox=2 -d

# run test suites with firefox
BROWSER=firefox docker-compose up

# bring down all
docker-compose -f grid.yaml down
docker-compose down