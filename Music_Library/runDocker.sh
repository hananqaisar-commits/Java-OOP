


sudo docker build -t music-library .


read -p "Want to open in terminal?(y/n)" ans
if [[ "$ans" == 'y' || "$ans" == 'Y' ]]; then
	sd run -it music-library /bin/bash

else
	sudo docker -it music-library 
fi

