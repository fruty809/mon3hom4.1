package com.example.mon3hom41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView recyclerView;
    private ArrayList<filmModel> filmList = new ArrayList<>();
    private filmAdapter adapter = new filmAdapter(filmList, this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.films_recycle);
        loadData();
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        filmList.add(new filmModel(R.drawable.image2, "Black Panther", "Movie", "С первого взгляда можно решить, что Ваканда — обычная территория дикой Африки, но это не так. Здесь, в недрах пустынных земель, скрываются залежи уникального металла, способного поглощать вибрацию. Многие пытались добраться до него, разоряя всё на своём пути и принося смерть аборигенам, но каждый раз таинственный дух саванны — Чёрная Пантера — вставал на защиту угнетённых."));
        filmList.add(new filmModel(R.drawable.image3, "Back to Future", "Movie", "Подросток Марти с помощью машины времени, сооруженной его другом профессором доком Брауном, попадает из 80-х в далекие 50-е. Там он встречается со своими будущими родителями, еще подростками, и другом-профессором, совсем молодым."));
        filmList.add(new filmModel(R.drawable.image4, "Home Alone", "Movie", "Американское семейство отправляется из Чикаго в Европу, но в спешке сборов бестолковые родители забывают дома… одного из своих детей. Юное создание, однако, не теряется и демонстрирует чудеса изобретательности. И когда в дом залезают грабители, им приходится не раз пожалеть о встрече с милым крошкой."));
        filmList.add(new filmModel(R.drawable.image5, "Teenage Mutant Ninja Turtles", "TV cartoon-serial", "«Черепашки-ниндзя» — американский компьютерный анимационный мультсериал. Премьера в США состоялась 29 сентября 2012 года на канале Nickelodeon. Это третий анимационный проект, спродюсированный компанией Nickelodeon Animation Studio, о Черепашках Мутантах Ниндзя. "));
        filmList.add(new filmModel(R.drawable.image6, "Stranger Things", "Serial", "«О́чень стра́нные дела́», или «Зага́дочные собы́тия» — американский научно-фантастический и драматический сериал в жанре ужасов, созданный братьями Даффер для стриминг-сервиса Netflix. Дафферы выступают шоураннерами, а также исполнительными продюсерами сериала вместе с Шоном Леви и Дэном Коэном"));
        filmList.add(new filmModel(R.drawable.image7, "Bleach", "Anime", "Переведено с английского языка.-«Блич» — японский аниме-телесериал, основанный на одноименной оригинальной манге Тайта Кубо. Его продюсировала Studio Pierrot, режиссер Нориюки Абэ. Сериал транслировался по телевидению Токио с октября 2004 года по март 2012 года и состоит из 366 серий."));

    }

    @Override
    public void onItemClick(filmModel filmModel) {
        Intent intent = new Intent(MainActivity.this, descriptionActivity.class);
        intent.putExtra("desc", filmModel.filmStory);
        intent.putExtra("image", filmModel.image);

        startActivity(intent);
    }
}