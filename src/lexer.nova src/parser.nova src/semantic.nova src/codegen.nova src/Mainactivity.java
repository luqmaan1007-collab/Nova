@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Uri fileUri = getIntent().getData();
    if (fileUri != null) {
        String path = getRealPathFromURI(fileUri);
        // Starta Nova Runner med filvägen
        runNovaFile(path);
    }
}

private void runNovaFile(String path) {
    // Här startar du Nova Runtime
    // Om du har en C-kompilerad Nova binary kan du köra den via Runtime.getRuntime()
    // Exempel (om du kör inbyggd binary):
    // Runtime.getRuntime().exec(new String[]{"/data/data/your.app/files/nova_runner", path});
}
