# Beginners guide to installing and using opencv 

# environment 
1. Eclipse Java EE IDE for Web Developers. Version: Neon.2 Release (4.6.2)
2. macOS Sierra 10.12.6
3. Maven

# Installing opencv

## pre-requisites 
 1. cmake 
 	- brew install cmake
	
## using homebrew
	'''
	brew tap homebrew/science
	brew install opencv3
	'''
### - OR -
	
	build from source
	
	git clone https://github.com/Itseez/opencv.git
	git clone https://github.com/Itseez/opencv_contrib.git
	cd opencv 
	mkdir build
	make
	make install
	cmake -D CMAKE_BUILD_TYPE=Release -D CMAKE_INSTALL_PREFIX=/usr/local -D OPENCV_EXTRA_MODULES_PATH=../../opencv_contrib/ -D WITH_CUDA=ON -D WITH_TBB=ON -D BUILD_PERF_TESTS=OFF -D BUILD_TESTS=OFF -D BUILD_SHARED_LIBS=OFF ..
	#build shared libs = off for java build
	
## Using with eclipse
	1. Add opencv jar to user libraries :
		- project properties -> Java Build Path -> Add Library -> User library -> User libraries -> New -> {$NAME = OpenCV} -> Add External jar ($PATH = path/to/opencv/build/bin) -> OK -> Add the library to project

	2. Add VM argument to run configurations :
		-Djava.library.path="/Users/siddharthmudgal/Documents/opencv-3.2.0/lib"
		
	3. Clone the project and import into eclipse
		git clone https://github.com/siddharthmudgal/beginOpenCV.git	
		
	4. Change the value of FileConstants.java accordingly
	
