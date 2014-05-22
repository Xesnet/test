using Microsoft.Owin.Hosting;
using System;

namespace NancyFxSelfHost
{
    class Program
    {
        static void Main(string[] args)
        {
            const string URL = "http://localhost:8080";

            using (WebApp.Start<Startup>(URL))
            {
                Console.WriteLine("Running on {0}", URL);
                Console.WriteLine("Press enter to exit");
                Console.ReadLine();
            }
        }
    }
}
