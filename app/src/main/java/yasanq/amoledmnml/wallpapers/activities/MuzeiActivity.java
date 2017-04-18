package yasanq.amoledmnml.wallpapers.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.wallpaper.board.activities.WallpaperBoardMuzeiActivity;
import yasanq.amoledmnml.wallpapers.services.MuzeiService;

public class MuzeiActivity extends WallpaperBoardMuzeiActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initMuzeiActivity(savedInstanceState, MuzeiService.class);
    }
}
