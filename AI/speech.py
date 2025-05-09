import speech_recognition as sr
import pyttsx3

# Initialize Text-to-Speech
engine = pyttsx3.init()
engine.setProperty('rate', 170)  # speaking speed

def speak(text):
    engine.say(text)
    engine.runAndWait()

# Initialize Speech Recognition
recognizer = sr.Recognizer()

def listen():
    with sr.Microphone() as source:
        print("🎤 Krishna is listening...")
        recognizer.adjust_for_ambient_noise(source)
        audio = recognizer.listen(source)
        try:
            query = recognizer.recognize_google(audio)
            print("🧠 You said:", query)
            return query.lower()
        except sr.UnknownValueError:
            speak("Sorry, I didn't get that.")
            return ""
        except sr.RequestError:
            speak("Network error. Try again.")
            return ""

# Main loop
while True:
    command = listen()
    if "exit" in command or "stop" in command:
        speak("Shutting down. Radhe Radhe Harsh!")
        break
    elif "hello" in command:
        speak("Radhe Radhe Harsh! Krishna online.")
    elif "your name" in command:
        speak("I am Krishna, your personal AI.")
    else:
        speak("I heard you say: " + command)
