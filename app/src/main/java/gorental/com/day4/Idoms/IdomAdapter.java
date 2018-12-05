package gorental.com.day4.Idoms;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import gorental.com.day4.R;

public class IdomAdapter extends ArrayAdapter<IdomClass> {
    private ArrayList<IdomClass> idomClasses;
    Context context;
    TextToSpeech toSpeech;

    public static class ViewHolder{
      TextView Eng_name;
      TextView Ban_name;
      ImageView image;
    }

    public IdomAdapter(ArrayList<IdomClass> idomClasses, Context context) {
        super(context, R.layout.idom_sample, idomClasses);
        this.context = context;
        this.idomClasses = idomClasses;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final IdomClass dataModel = getItem(position);

        final IdomAdapter.ViewHolder holder;
        final View result;

        if (convertView == null) {

            holder = new IdomAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.idom_sample, parent, false);
            holder.Eng_name = (TextView) convertView.findViewById(R.id.tv_idom);
            holder.Ban_name = (TextView) convertView.findViewById(R.id.tv_idoms);
            holder.image = (ImageView) convertView.findViewById(R.id.iv_idom);

            result = convertView;

            convertView.setTag(holder);

        } else {
            holder = (IdomAdapter.ViewHolder) convertView.getTag();
            result = convertView;
        }

        toSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    toSpeech.setLanguage(Locale.UK);
                }
            }
        });

        holder.Eng_name.setText(dataModel.getEng_name());
        holder.Ban_name.setText(dataModel.getBan_name());
        holder.image.setImageResource(dataModel.getImageId());
        holder.image.setTag(position);

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<1000; i++){
                    String toSpeak = holder.Eng_name.getText().toString();
                    toSpeech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

        return convertView;
    }

}


