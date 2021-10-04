# Hardware-Ordering-Heirarchy
Example of inheritance and object oriented design by building a ordering system for a hardware store like home depot that would organize a few different types of fasteners.

Although this was not asked for I wanted a separate file to explain the hierarchy of the Fasteners
 Below is a visual of the order
 												     	[Fasteners]
                            /            \
 													/		             \
 										[Has_Threads]		      	[Nails]
 									   /			    \				           \
 						[Male_Threaded]		[Female_Threaded]		[Common_Nail]
 					  /	         \					|					
 					[Bolts]		[Screws]		[Wing_Nut]			
 						|		           	\
 			[Carriage_Bolt]		[Wood_Screw]
 			
 	Essentially the hierarchy was built to organize the types of hardware in a store. 
 	Although I could have made the hierarchy pretty shallow, I decided to vertically integrate like properties where possible,
 	To reduce duplicate code.
 	
 	This means that I added classes like Male_Threaded and Female_Threaded, in case many more items were added and 
 	would not fit in the normal descriptions.
 	For example if a Keyserts was added to the to hierarchy it wouldn't classify as a Nut but it has inner threads, 
 	so it could be described by the Female_Thread parent class. Or if Sockets were added to the hierarchy all the 
 	properties of Male_Threaded could carry into the Sockets Parent Class, thus reducing duplication.
