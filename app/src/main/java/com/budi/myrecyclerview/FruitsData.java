package com.budi.myrecyclerview;

import java.util.ArrayList;

class FruitsData {
    private static String[] fruitsNames = {
            "Buah Sirsak",
            "Buah Belimbing",
            "Buah jeruk",
            "Buah Apel",
            "Buah Rambutan",
            "Buah Nanas",
            "Buah Durian",
            "Buah Jambu",
            "Buah Naga",
            "Buah Anggur"
    };

    private static String[] fruitsDetails = {
            "Sirsak adalah buah dari Annona muricata, pohon berdaun lebar, berbunga, dan selalu hijau.",
            "Belimbing, juga dikenal sebagai belimbing atau 5 jari, adalah buah dari Averrhoa carambola, spesies pohon asli Asia Tenggara tropis.",
            "Jeruk merupakan sebuah buah yang memiliki khasiat. Jeruk yang merupakan buah sitrus memiliki banyak kandungan vitamin C dan anti oksidan, yang meningkatkan sistem kekebalan tubuh dan membantu melawan infeksi dan flu.",
            "Apel merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan, namun bisa juga kulitnya berwarna hijau atau kuning. ",
            "Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah kepulauan di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut.",
            "Nanas adalah tumbuhan tropis dengan buah yang dapat dimakan dan tumbuhan yang paling penting secara ekonomi dalam famili Bromeliaceae. Nanas adalah tumbuhan asli Amerika Selatan, dan telah dibudidayakan disana selama berabad-abad.",
            "Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan.",
            "Jambu biji adalah buah tropis yang umum dibudidayakan di banyak daerah tropis dan subtropis. Jambu biji biasa Psidium guajava adalah pohon kecil dalam keluarga murad, asli Meksiko, Amerika Tengah, Karibia, dan Amerika Selatan bagian utara.",
            "Buah naga adalah buah dari beberapa jenis kaktus dari marga Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti Taiwan, Vietnam, Filipina, Indonesia dan Malaysia.",
            "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae. Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung."
    };

    private static int[] fruitsImages = {
            R.drawable.buah_sirsak,
            R.drawable.buah_belimbing,
            R.drawable.buah_jeruk,
            R.drawable.buah_apel,
            R.drawable.buah_rambutan,
            R.drawable.buah_nanas,
            R.drawable.buah_durian,
            R.drawable.buah_jambu,
            R.drawable.buah_naga,
            R.drawable.buah_anggur
    };

    static ArrayList<Fruits> getListData() {
        ArrayList<Fruits> list = new ArrayList<>();
        for (int position = 0; position < fruitsNames.length; position++) {
            Fruits fruits = new Fruits();
            fruits.setName(fruitsNames[position]);
            fruits.setDetail(fruitsDetails[position]);
            fruits.setPhoto(fruitsImages[position]);
            list.add(fruits);
        }
        return list;
    }
}