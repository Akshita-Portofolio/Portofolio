from flask import Flask, request, jsonify
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

@app.get("/")
def home():
    return jsonify({"message": "Akshita's portfolio API is running."})

@app.post("/contact")
def contact():
    data = request.get_json(silent=True) or {}
    name = data.get("name", "").strip()
    email = data.get("email", "").strip()
    message = data.get("message", "").strip()
    if not name or not email or not message:
        return jsonify({"message": "Please fill in all fields."}), 400
    print(f"New message from {name} <{email}>: {message}")
    return jsonify({"message": "Thanks! Your message was received."})

if __name__ == "__main__":
    app.run(debug=True, port=5000)
