package com.nxt.day7.diff

import androidx.recyclerview.widget.DiffUtil
import com.nxt.day7.Person

class ContactDiffUtil(
    private var oldContacts: List<Person>,
    private var newContacts: List<Person>,
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldContacts.size

    override fun getNewListSize(): Int = newContacts.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldContacts[oldItemPosition].name == newContacts[newItemPosition].name
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItemPosition == newItemPosition
    }
}