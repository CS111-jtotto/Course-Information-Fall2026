Here are instructions to write your first commit on the class' shared repository.

Use `<up-arrow>` to retrieve commands from your terminal history.

% cd Course-Information-Fall2026

% git fetch

% git status

% git pull --rebase

% git add Week\ 1/HelloJasmine.java

% git commit -m "Upload my hello world program"

% git push

The `--rebase` flag to `git pull` tells it to avoid merging changes.

The `-m <commit-message>` flag to `git commit` tells it to accept a string from the terminal, instead of putting you in the text editor.

Otherwise, the `vim` text editor may open. Type `:q!<enter>` to close `vim` without saving, or `:wq<enter>` to save the file as-is and exit.

---

If your push is rejected, you can check the upstream URL in order to verify whether it is on SSH (git@...) or HTTPS (https://):

% git remote -v

If you are on HTTPS, follow instructions in `Week\ 1/ssh_agent.md` to generate an SSH key pair, which will enable you to submit code using `git` commands.

---

If your Course Information repository gets lost or broken, you can always get a fresh copy by cloning from upstream:

% git clone git@github.com:CS111-jtotto/Course-Information-Fall2026.git

If you recently installed `git` from Homebrew or the Windows installer, you might have a terminal open with a stale PATH that can't see the `git` command. Start a fresh terminal.