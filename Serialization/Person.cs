using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;


namespace Serialization
{
   
   public  class Person
    {
        public string FirstName { get; }
        public string LastName { get; }

        public string Dob { get; }

        public Person(string firstname,string lastname, DateTime dob)
        {
            FirstName = firstname;
            LastName = lastname;
            Dob = dob.ToString("MM/dd/yyyy");
        }

        public void Serializer(Object data, string filePath)
        {
            //1
            JsonSerializer jsonSerializer = new JsonSerializer();
            //2
            if (File.Exists(filePath)) File.Delete(filePath);
            //3
            StreamWriter sw = new StreamWriter(filePath);
            //4
            JsonWriter jsonWriter = new JsonTextWriter(sw);
            //5
            jsonSerializer.Serialize(jsonWriter, data);
            //6
            sw.Close();
            jsonWriter.Close();
        }

        public  Object Deserializer(Type datatype, string filePath)
        {
            //1
            JObject obj = null;
            //2
            JsonSerializer jsonSerializer = new JsonSerializer();
            //3
            if (File.Exists(filePath))
            {
                //4
                StreamReader sr = new StreamReader(filePath);
                //5
                JsonReader jsonReader = new JsonTextReader(sr);
                //6
                obj = jsonSerializer.Deserialize(jsonReader) as JObject;
                //7
                sr.Close();
                //8
                jsonReader.Close();
            }
            //9
            return obj.ToObject(datatype);
        }


    }
}
