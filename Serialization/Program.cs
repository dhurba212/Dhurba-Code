using System;
using System.Collections.Generic;
using System.IO;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;


namespace Serialization
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Person newPerson = new Person("Dhurba", "Ghimire", new DateTime(1984,5,19));

            //Using a method Serializer and Deserializer filepath.
            string filePath = "Data.Save";
            newPerson.Serializer(newPerson, filePath);
            //var obj=newPerson.Deserializer( filePath);


            //Printing directly to console, serialization
            string result = JsonConvert.SerializeObject(newPerson);
            Console.WriteLine(result);
            //Deserialization
            Person deserializedResult= JsonConvert.DeserializeObject<Person>(result);
            Console.WriteLine(deserializedResult.FirstName);

            //Serialization and Deserialization on list
            List<Person> personList = new List<Person>
            {
                new Person("Sangita","Dhakal",new DateTime(1993/11/15)),
                new Person("Prativa","Ghimire",new DateTime(1992/10/10)),
                new Person("Sadhiya","Ghimire",new DateTime(2019/08/23))
            };
            newPerson.Serializer(personList, "Data.Save2");
            string listOfPerson = JsonConvert.SerializeObject(personList);
            Console.WriteLine(listOfPerson);

            List<Person> deserializedPersonList = JsonConvert.DeserializeObject <List<Person>>(listOfPerson);
            foreach(Person deserializedPerson in deserializedPersonList)
            {
                Console.WriteLine($"\nFirstName: {deserializedPerson.FirstName}\t  LastName: {deserializedPerson.LastName}");
            }
            
        }

       
    }
}
