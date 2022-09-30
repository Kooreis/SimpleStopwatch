import time

class Stopwatch:
    def __init__(self):
        self.start_time = 0
        self.stop_time = 0
        self.running = False

    def start(self):
        self.start_time = time.time()
        self.running = True

    def stop(self):
        if self.running:
            self.stop_time = time.time()
            self.running = False

    def elapsed_time(self):
        if self.running:
            return time.time() - self.start_time
        return self.stop_time - self.start_time

def main():
    stopwatch = Stopwatch()
    while True:
        command = input("Enter command (start, stop, elapsed, quit): ")
        if command == "start":
            stopwatch.start()
        elif command == "stop":
            stopwatch.stop()
        elif command == "elapsed":
            print("Elapsed time: ", stopwatch.elapsed_time())
        elif command == "quit":
            break

if __name__ == "__main__":
    main()