Setting up an SSH key gives your computer an identity, allowing us to share files and project folders over `git`. You will generate a key pair locally, then copy the public key to your GitHub account settings.

If you are using Windows, skip the macOS instructions below.

---

**macOS Setup**

1. **Generate the SSH Key:**
Open **Terminal** and enter the following command (replace with your GitHub email):

```bash
ssh-keygen -t ed25519 -C "your_email@example.com"

```

Press **Enter** to accept the default file location. Optionally enter a passphrase, and write it down if you do. Or, press **Enter** twice to skip.


2. **Add Key to SSH Agent:**
Start the SSH agent in the background:

```bash
eval "$(ssh-agent -s)"

```

Add your key to the agent and store the passphrase in the macOS Keychain:

```bash
ssh-add --apple-use-keychain ~/.ssh/id_ed25519

```


3. **Copy the Public Key:**
Copy the entire contents of your public key to your clipboard:

```bash
pbcopy < ~/.ssh/id_ed25519.pub

```
Skip the Windows instructions below, and proceed to log in on GitHub.

---

**Windows Setup**

1. **Generate the SSH Key:**
Open **Git Bash** or **PowerShell** and run:

```powershell
ssh-keygen -t ed25519 -C "your_email@example.com"

```

Press **Enter** to save the key in the default path (`C:\Users\you\.ssh\id_ed25519`). Press **Enter** twice to skip adding a passphrase if desired.


2. **Start the SSH Agent:**
In PowerShell (run as Administrator if needed), ensure the SSH agent service is active:

```powershell
Get-Service ssh-agent | Set-Service -StartupType Automatic
Start-Service ssh-agent
ssh-add ~/.ssh/id_ed25519

```


3. **Copy the Public Key:**
Copy the public key string to your clipboard:

* **PowerShell:**

```powershell
Get-Content ~/.ssh/id_ed25519.pub | Set-Clipboard

```

* **Git Bash:**

```bash
clip < ~/.ssh/id_ed25519.pub

```

---

**Add Key to GitHub & Verify**

1. Log in to [GitHub](https://github.com).
2. Click your profile icon in the top-right corner and select **Settings**.
3. In the left sidebar, click **SSH and GPG keys**.
4. Click **New SSH key**.
5. Enter a descriptive **Title** (e.g., "Work MacBook" or "Personal Windows PC").
6. Leave Key type as **Authentication Key**.
7. Paste your public key into the **Key** field and click **Add SSH key**.


2. **Test the Connection:**
In your terminal or PowerShell, run:

```bash
ssh -T git@github.com

```

Type `yes` if prompted about host authenticity. A successful connection returns:

> *Hi username! You've successfully authenticated, but GitHub does not provide shell access.*
