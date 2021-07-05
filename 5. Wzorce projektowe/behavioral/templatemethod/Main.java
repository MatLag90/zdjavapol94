package behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        LetterComposerHelper letterComposerHelper = new FormalLetterComposerHelper();
        String letter = letterComposerHelper.compose("Adam Adamowski", "Tomasz Tomaszowski",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin non tempus leo, non pellentesque dui. Cras in ante pretium, pretium leo ut, ultricies nisl. Integer quis lectus ac dolor placerat gravida a a diam. Cras at dui non neque sollicitudin tincidunt eu sit amet libero. Proin et leo semper augue dapibus vulputate. Quisque ornare, elit eu dapibus varius, metus arcu pulvinar sem, at ornare dui mi sed metus. Nunc fermentum et lacus eget fermentum. Donec accumsan lacus vitae odio feugiat, non blandit ante rutrum.\n" +
                        "Sed condimentum, enim ac laoreet convallis, mauris nisi consectetur lacus, at sollicitudin enim urna id purus. Quisque varius tortor arcu, ac cursus mi elementum et. Pellentesque vitae auctor ex, et lobortis nisl. Proin consequat iaculis lobortis. Cras sed congue elit. Sed tincidunt, tortor nec gravida ultricies, mi elit tincidunt ante, id mollis elit purus quis magna. Pellentesque in varius lectus, vitae auctor tortor. Proin id dolor at metus vehicula scelerisque.\n" +
                        "Fusce ac gravida lectus, sit amet egestas ligula. Fusce sit amet faucibus turpis. Praesent tempus rhoncus pellentesque. Aenean imperdiet iaculis tortor id lobortis. Donec non dolor vitae erat consectetur eleifend. Fusce sollicitudin sollicitudin urna sit amet pharetra. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vel enim aliquam, suscipit velit sed, elementum mi. Phasellus tincidunt euismod justo, at sodales neque malesuada porta. Praesent viverra imperdiet sapien, at porta metus ultrices eu.");
        System.out.println(letter);
    }
}
