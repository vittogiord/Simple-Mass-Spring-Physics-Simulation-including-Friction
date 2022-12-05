# Simple-Mass-Spring-Physics-Simulation-including-Friction
This is a Java implementation of a physics simulation of a simple spring, including mass and friction. It is based on calculating velocity and position every Dt seconds. 
The program is based on the iteration, at each iteration, we have the current time t from the beginning of the simulation and the delta time Dt, and it is calculated:
- The vector position at t+Dt instant. ap=  ap+v*Dt+0.5*((ep-ap)+ff)/m*Dt^2.
- The vector velocity at t+Dt instant, v= v+Dt+((ep-ap)+ff)/m.
- The vector friction force, that is constant in the module, but changes in verse, the verse is opposite to the verse of velocity. ff= v / |v| * (- |ff|).<br />
Where:
- ap is the vector position (from the fixed point of the spring) of the body expressed in meter at the instant t (after the assignment ap will be the vector position at the instant t+Dt).
- v is the vector velocity expressed in meter/second at the instant t (after the assignment v will be the velocity at the instant t+Dt).
- ep is the equilibrium point (from the fixed point of the spring) expressed in meter.
- ff is the vector friction force expressed in newton (after the assignment ff will be the friction force at instant t+Dt).
- m is the mass of the body expressed in kg. 
<br />((ep-ap)+ff)/m is equal at the vector acceleration of the body at the instant t.
