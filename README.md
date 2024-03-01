# Shoreline assignment


I chose to implement the solution in Java, this being an OOP language that allowed me to model the problem according to the requirements.


## Description of the model

Below is a simplified UML diagram of the classes that I made.
 
![shorelineUML](https://github.com/pal-Alexandra/Shoreline/assets/100137533/a9d14e64-60fb-459b-9471-99ed205f5f72)



## Design and algorithms

I design the classes taking into account the relationships induced by the requirements. Also, I tried to separate the logic of the simulation from the classes that are involved the simulation.

## Algorithm

In order to gain as many points as I can, for each round I keep track of the serial numbers of the unhealthy robots. In that way, when I call the commandCenter to repair robots, this  will call only those controllers that have robots that are unhealthy and, more, in order to consume as few points as possible , it is made only one call for a controller to repair as many robots as it can, of those it monitors
