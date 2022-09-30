using System;
using System.Diagnostics;

class Program
{
    static void Main(string[] args)
    {
        Stopwatch stopwatch = new Stopwatch();
        string command = "";

        while (command != "exit")
        {
            Console.WriteLine("Enter 'start' to start stopwatch, 'stop' to stop, 'reset' to reset, 'exit' to exit");
            command = Console.ReadLine();

            switch (command)
            {
                case "start":
                    stopwatch.Start();
                    break;
                case "stop":
                    stopwatch.Stop();
                    Console.WriteLine("Elapsed time: {0}", stopwatch.Elapsed);
                    break;
                case "reset":
                    stopwatch.Reset();
                    break;
            }
        }
    }
}