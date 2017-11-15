# Veterinarian-Schedule
See ReadMe

Assignment 3
This is an individual assignment. You will design the administration program for a veterinary office: This office attends to three different kinds of animals: Dogs, Birds, and Fish. You are to capture these with their respective classes. Each subclass of animals will have 5 different varieties. You are to define what those are for each kind of animal.
You should keep track, for every animal, the following information:

•	Owner.
•	Name of the animal.
•	Age of the animal.
•	Medical history: A list of diseases, and a status for each: current or past.
•	A list of vaccinations, if applicable.
•	Current appointments.

Appointments are their own entity, so this should captured with a class, containing date and time, and client.
You should also have a class for owners with information like name, address, and phone number.
Here's the functionality you must provide:

•	See a list of all appointments, and change the status from outstanding to resolved. When an appointment is resolved, it is removed from the list.
•	Search appointments by owner and by date.
•	Search medical records by animal name, owner, and animal kind (like show all appointments for Dogs).
•	From the screen of the record of a particular animal, check appointments, and add appointments.
•	The whole registry can be saved and restored to/from a file.

For all the search functionalities you are to implement it using a search function that uses a Java Comparator for each case (say search(T[] list, Comparator<T> comp)). You are also required to handle all input problem on the UI (like the user entering wrong kind of input, say a number instead of a letter) using Java's exception handling.
Follow the submission guidelines and submit compressed file on blackboard.
This assignment is worth 100 points.

