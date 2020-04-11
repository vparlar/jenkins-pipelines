node {
	properties(
		[parameters(
			[choice(choices: 
				[
				'v0.1', 
				'v0.2', 
				'v0.3', 
				'v0.4', 
				'v0.5'], 
	description: 'Which version of the app should I deploy? ', 
		name: 'Version'), 
			choice(choices: 
			[
			'dev.vparlar.com', 
			'qa.vparlar.com', 
			'stage.vparlar.com', 
			'prod.vparlar.com'], 
	description: 'Please provide an environment to build the application', 
		name: 'Environment')])])
	stage("Stage2"){
		timestamps {
			git 'https://github.com/farrukh90/packer.git'
	}
}
	stage("Stage2"){
		timestamps {
			ws {
				echo "hello"
		}
	}
}
	stage("Stage3"){
		timestamps {
			ws {
				echo "hello"
		}
	}
}
	stage("Stage4"){
		timestamps {
			ws {
				echo "hello"
		}
	}
}
	stage("Stage5"){
		timestamps {
			ws {
				withDockerContainer('centos') {
					echo "Hello"
                    sleep 20
				}
			}
		}
	}
}
