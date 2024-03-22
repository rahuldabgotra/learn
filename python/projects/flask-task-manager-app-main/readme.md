# Task Manager App

Create a virtual environment

```bash
py -3 -m venv .venv
```

Activate it

- For  Windows

  ```bash
  .venv\Scripts\activate
  ```

- For  Mac

  ```bash
  source .venv/bin/activate
  ```

Install Requirements

```bash
pip install -r requirements.txt
```

Run App

```bash
python app.py
```

**Extra Commands:** Creating secrets tokens

```bash
import secrets
secret_key = secrets.token_hex(16)
print(secret_key)

jwt_secret_key = secrets.token_urlsafe(32)
print(jwt_secret_key)
```

**Viewing Logs:** Logs will be written to the app.log file. To view the logs, you can open the app.log file in a text editor or using tail command in the terminal for real-time updates.In a terminal, you can use:

```bash
tail -f app.log
```
