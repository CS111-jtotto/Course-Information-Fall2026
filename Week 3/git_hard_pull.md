Run `git fetch` to update the repository, then `git status` to count upstream commits.

You should see that commits have diverged, which should happen rarely. In this case, because I anonymized the `git` submission history earlier, *all* of the commits have diverged.

Please reset your repository by saving changes:
```
git stash
```

Then updating:
```
git fetch origin
git reset --hard origin/main
```