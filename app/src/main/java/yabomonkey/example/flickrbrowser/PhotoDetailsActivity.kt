package yabomonkey.example.flickrbrowser

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.navigation.ui.AppBarConfiguration
import com.squareup.picasso.Picasso
import yabomonkey.example.flickrbrowser.databinding.ActivityPhotoDetailsBinding

class PhotoDetailsActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityPhotoDetailsBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPhotoDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        activateToolbar(true)

        val photo = intent.getParcelableExtra<Photo>(PHOTO_TRANSFER) as Photo

        binding.mainContent.photoTitle.text = photo.title
        binding.mainContent.photoTags.text = photo.tags
        binding.mainContent.photoAuthor.text = photo.author
        Picasso.get()
            .load(photo.link)
            .error(R.drawable.placeholder)
            .into(binding.mainContent.photoImage)
    }


}