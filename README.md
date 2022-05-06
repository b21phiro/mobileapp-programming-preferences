
# Rapport

## Spara

Shared preferences är ett sätt att spara data med nyckel-värde-par, som sparas (ungefär som Cookies).
Denna data bör inte vara stor. Detta görs mha SharedPreferences API'n.

I denna uppgift använder jag mig utav getSharedPreferences() - Då det tillåter mig att dela flera olika
preferens-filer (identifieras mha namn). Den kan kallas i vilket Context som helst. Google rekommenderar 
att man namnger preferensfiler som är unikt till ens app, ex app-id med ett prefix.

I metoden save() tas en sträng emot, som sätts in med hjälp utav SharedPreferences.Editor. Genom
.putString() sätts först en "key" in och sedan datan/värdet. Sist måste den sparas, vilket görs med
antingen commit() eller apply(). Nu är datan sparad!

```
// SharedActivity.java

public void save(String data) {
    SharedPreferences pref = getSharedPreferences("com.example.preferences.SAVED_INPUT", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = pref.edit();
    editor.putString("input", data);
    editor.apply();
}

```
## Hämta

Datan hämtas genom prefixet och det kontext man söker genom, sedan hämtar man den data som finns. 
I detta fall, används getString() då det är en sträng som hämtas. Den andra parametern är ifall ingen
data hittas, så blir dett "default". Sedan printas värdet ut!

```
// MainActivity.java

@Override
protected void onResume() {
    super.onResume();
    
    SharedPreferences pref = getSharedPreferences("com.example.preferences.SAVED_INPUT", Context.MODE_PRIVATE);
    String savedData = pref.getString("input", null);
    TextView display = findViewById(R.id.value);
    display.setText(savedData);
}
```

![bild.gif](bild.gif)