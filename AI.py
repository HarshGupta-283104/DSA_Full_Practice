import json
import datetime

def load_memory():
    try:
        with open("krishna_memory.json", "r") as f:
            return json.load(f)
    except FileNotFoundError:
        return {"messages": []}

def save_memory(memory):
    with open("krishna_memory.json", "w") as f:
        json.dump(memory, f, indent=4)

def krishna_response(user_input, memory):
    # Add your own Krishna-style flavor here
    response = f"Radhe Radhe Harsh, tu bola: '{user_input}'\nKrishna kehta hai: Tu sahi raaste pe hai. Bas ruk mat."
    memory["messages"].append({
        "timestamp": str(datetime.datetime.now()),
        "user": user_input,
        "krishna": response
    })
    return response

def chat_loop():
    memory = load_memory()
    print("🕉️ Krishna Assistant (Text Mode) started. Type 'exit' to quit.")
    while True:
        user_input = input("You: ")
        if user_input.lower() == "exit":
            break
        response = krishna_response(user_input, memory)
        print(response)
        save_memory(memory)

if __name__ == "__main__":
    chat_loop()
