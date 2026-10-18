package HashMap.RegistrationWaitingList;




// TODO 1: Import HashMap, Map, and Set types


import java.util.HashMap;

public class ListManager {

    // TODO 2: Create a new hash map named studentsMap //
HashMap studentsMap = new HashMap();


    public ListManager(Student [] students){
        /* TODO 3:  Iterate through the studentsArray and add the
                    data to the studentsMap. Use the students'
                    last names as the keys and the student
                    objects as the values  */
        for (Student student : students){
            studentsMap.put(student.lastName,student);
        }
    }


    public void listStudents( ){

        // TODO 4: Check if studentsMap is empty.


        // TODO 5: If studentsMap is empty, print an alert saying that

        if (studentsMap.isEmpty())
            System.out.println("No students in list");
        else
            System.out.println(studentsMap);
        /* TODO 6: If the studentMap is not empty, print a list of all
                   student  */

    }

    public void findStudent(String lastName){

        // TODO 8: Check if studentsMap contains the last name.

        // If not, print: "Student with name 'X' does not exist." and return.

        if (!studentsMap.containsKey(lastName)){
            System.out.println("Student with last name " + lastName + " Not found");
            return;
        }else {
            Student student = (Student)studentsMap.get(lastName);
            System.out.println(student.toString());
        }

        // TODO 9: If the key exists, get a reference to the Student object using studentsMap.get(lastName)
        // TODO 10: If the student exists, print the Student object
        // TODO 11: If the student doesn’t exist, print an error message
    }


    public void updateStudentStatus(String lastName, String newStatus) {
       /* TODO 13: use the get() method on studentMap to obtain a
        reference to the Student object */
    /* TODO 14: if the student exists, change the status to
        newStatus, and print a confirmation message. */
        // TODO 15: Print an error message if the student doesn't exist.

        if ((Boolean) studentsMap.get(lastName)){
            studentsMap.put(lastName, newStatus);
            System.out.println("Student "+ lastName + "status was changed from 'UNDER-REVIEW' to 'ENROLLED");
        }else {
            System.out.println("Student doesn't exist!");
        }

    }
        public void removeStudent(String lastName){
        /* TODO 17: using the lastName parameter, attempt to remove
        a student from the studentsMap */
    /* TODO 18: print a message confirmation and student
        information if the student was successfully removed. */
    /* TODO 19: if the student is not removed, print
        a statement that the student was not removed. */
            if (studentsMap.containsKey(lastName)){
                studentsMap.remove(lastName);
                System.out.println("Student with last name " + lastName + " was successfully removed.");
            }else {
                System.out.println("Student with last name " + lastName + " Not found");
            }
        }
    }