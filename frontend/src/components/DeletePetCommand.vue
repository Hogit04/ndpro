<template>
    <v-card outlined>
        <v-card-title>
            DeletePet
        </v-card-title>

        <v-card-text>
            <Number label="PetId" v-model="value.petId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deletePet"
            >
                DeletePet
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeletePetCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.petId = 0;
        },
        watch: {
        },
        methods: {
            deletePet() {
                this.$emit('deletePet', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

