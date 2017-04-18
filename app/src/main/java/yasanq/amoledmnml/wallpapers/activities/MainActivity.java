package yasanq.amoledmnml.wallpapers.activities;

import android.os.Bundle;

import com.dm.wallpaper.board.activities.WallpaperBoardActivity;
import yasanq.amoledmnml.wallpapers.licenses.License;

public class MainActivity extends WallpaperBoardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initMainActivity(savedInstanceState,
                License.isLicenseCheckerEnabled(),
                License.getRandomString(),
                License.getLicenseKey(),
                License.getDonationProductsId());
    }
}
