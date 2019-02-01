package com.revosleap.bxplayer.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.revosleap.bxplayer.AppUtils.RecyclerView.Adapters.ArtistAdapter
import com.revosleap.bxplayer.AppUtils.Utils.GetAudio
import com.revosleap.bxplayer.R
import kotlinx.android.synthetic.main.fragment_artists.*


class FragmentArtists : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_artists, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val models = GetAudio().geAllAudio(activity)
        val adapterArt = ArtistAdapter(models, activity)
        artistrecycler.apply {
            adapter = adapterArt
            layoutManager = LinearLayoutManager(activity)
            hasFixedSize()
        }

    }

}
