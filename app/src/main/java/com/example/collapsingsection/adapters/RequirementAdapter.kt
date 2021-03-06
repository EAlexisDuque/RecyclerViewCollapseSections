package com.example.collapsingsection.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.collapsingsection.adapters.viewholders.RequirementViewHolder
import com.example.collapsingsection.models.Requirement

/**
 * @author Alexis Duque on 2019-05-20.
 * @company Condor Labs
 * @email eduque@condorlabs.io
 */
class RequirementAdapter(
    private val requirementItemList: List<Requirement>
) : RecyclerView.Adapter<RequirementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequirementViewHolder {
        return RequirementViewHolder(LayoutInflater.from(parent.context), parent)
    }

    override fun onBindViewHolder(holderItem: RequirementViewHolder, position: Int) {
        holderItem.bind(requirementItemList[position])
    }

    override fun getItemCount(): Int = requirementItemList.size
}
