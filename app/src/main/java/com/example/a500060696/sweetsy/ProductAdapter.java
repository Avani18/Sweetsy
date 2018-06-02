package com.example.a500060696.sweetsy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<product> productList ;

    public ProductAdapter(Context mCtx, List<product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }


    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view= inflater.inflate(R.layout.card_view, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ProductViewHolder holder, int position) {
        product product= productList.get(position);
        holder.textViewCake.setText(product.getCakename());
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class  ProductViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textViewCake;
        TextView textViewPrice;
        TextView textViewRating;
        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView= itemView.findViewById(R.id.imageView);
            textViewRating= itemView.findViewById(R.id.textViewRating);
            textViewPrice= itemView.findViewById(R.id.textViewPrice);
            textViewCake= itemView.findViewById(R.id.textViewCake);

        }
    }
}

